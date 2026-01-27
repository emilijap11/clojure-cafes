(ns clojurecafes.web
    (:require [hiccup.page :refer [html5]]))

(defn results-page [cafes]
      (html5
        [:head
         [:title "Preporučeni kafici"]
         ; [:link {:rel "stylesheet" :href "/style.css"}]
         [:link {:rel "stylesheet" :href (str "/style.css?v=" (System/currentTimeMillis))}]]))]
        [:body
         [:h1 "Preporučeni kafici"]
         (if (empty? cafes)
           [:p "Nema dostupnih kafica za vaše kriterijume."]
           [:ul
            (for [c cafes]
                 [:li
                  [:strong (:name c)] " – "
                  (:location c)
                  [:br]
                  "Otvoreno do: " (:open-until c) "h"
                  [:br]
                  ;"Udaljenost: " (format "%.2f" (:distance c)) " km"
                  [:br]
                  (:note c)
                  [:br]
                  [:a {:href (str "https://www.google.com/maps/search/?api=1&query="
                                  (:lat c) "," (:lng c))
                       :target "_blank"}
                   "Pogledaj na mapi"]])])]))
