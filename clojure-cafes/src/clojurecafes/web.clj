(ns clojurecafes.web
    (:require [hiccup.page :refer [html5]]))




(defn results-page [cafes]


      (html5
        [:head
         [:title "Preporučeni kafici"]
         [:link {:rel "stylesheet" :href "/style.css"}]]
        [:body
         [:h1 "Preporučeni kafici"]
         (if (empty? cafes)
           [:p "Nema dostupnih kafica za vaše kriterijume."]
           [:ul
            (for [c cafes]
                 [:li {:class "kafic"}
                  [:span {:class "kafic-naslov"} (:name c)]
                  [:span {:class "kafic-info"} (str " – " (:location c) ", otvoreno do " (:open-until c) "h, udaljenost: " (format "%.2f" (:distance c)) " km")]
                  [:br]
                  [:a {:href (str "https://www.google.com/maps/search/?api=1&query="
                                  (:lat c) "," (:lng c))
                       :target "_blank"
                       :class "map-button"} "Pogledaj na mapi"
                   ]])])]))
