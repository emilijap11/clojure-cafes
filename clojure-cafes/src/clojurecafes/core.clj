(ns clojurecafes.core
  (:require [clojurecafes.db :as db]
            [clojurecafes.maps :as maps]))

(defn filter-cafes [user]
  (let [lat (:lat user)
        lng (:lng user)
        coffee (when (:coffee user) (keyword (:coffee user)))
        milk (when (:milk user) (keyword (:milk user)))
        ambience (when (:ambience user) (keyword (:ambience user)))
        smoke (when (:smoke user) (keyword (:smoke user)))
        pet (when (:pet user) (keyword (:pet user)))
        location (:location user)]
    (loop [cafes db/cafes
           results []]
      (if (empty? cafes)
        (take 5 (sort-by :distance results))
        (let [cafe (first cafes)
              rest-cafes (rest cafes)]
          (if (and (or (nil? location) (= (:location cafe) location))
                   (or (nil? coffee) (contains? (:coffee cafe) coffee))
                   (or (nil? milk) (contains? (:milk cafe) milk))
                   (or (nil? ambience) (= (:ambience cafe) ambience))
                   (or (nil? smoke) (= (:smoke cafe) smoke))
                   (or (nil? pet) (= (:pet cafe) pet)))
            (recur rest-cafes
                   (conj results
                         (assoc cafe
                                :distance (maps/distance-km lat lng (:lat cafe) (:lng cafe)))))
            (recur rest-cafes results)))))))
