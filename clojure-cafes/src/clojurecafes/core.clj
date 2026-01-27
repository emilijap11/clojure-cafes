(ns clojurecafes.core
    (:require [clojurecafes.maps :as maps]
      [clojurecafes.db :as db]))

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


                   (take 5
                         (sort-by :distance results))


                   (let [c (first cafes)
                         rest-cafes (rest cafes)]


                        (if (and
                              (or (nil? location) (= (:location c) location))
                              (or (nil? coffee) (contains? (:coffee c) coffee))
                              (or (nil? milk) (contains? (:milk c) milk))
                              (or (nil? ambience) (= (:ambience c) ambience))
                              (or (nil? smoke) (= (:smoke c) smoke))
                              (or (nil? pet) (= (:pet c) pet)))
                          (recur rest-cafes
                                 (conj results (assoc c :distance (maps/distance-km lat lng (:lat c) (:lng c)))))
                          (recur rest-cafes results)))))))
