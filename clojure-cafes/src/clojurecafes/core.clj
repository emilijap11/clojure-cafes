(ns clojurecafes.core
    (:require [clojurecafes.maps :as maps]
      [clojurecafes.db :as db]
      ))

(defn matches? [c user]
      {:milk     (= (:milk c) (:milk user))
       :ambience (= (:ambience c) (:ambience user))
       :smoke    (= (:smoke c) (:smoke user))
       :pet      (= (:pet c) (:pet user))})



(defn filter-cafes [user]
      (let [{:keys [coffee location]} user
            coffee-kw (keyword coffee)]

           (->> db/cafes
                (filter #(= (:location %) location))
                (filter #(contains? (:coffee %) coffee-kw))
                (map #(assoc %
                             :match (matches? % user)))
                (map #(assoc %
                             :distance (maps/distance-km
                                         (:lat user) (:lng user)
                                         (:lat %) (:lng %))))


                (sort-by :distance)
                (take 5))))

