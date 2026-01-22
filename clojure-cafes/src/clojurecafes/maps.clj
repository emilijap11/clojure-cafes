(ns clojurecafes.maps)


(defn distance-km
      "Računa udaljenost između dve tačke (lat1, lon1) i (lat2, lon2) u kilometrima."
      [lat1 lon1 lat2 lon2]
      (let [R 6371
            dlat (Math/toRadians (- lat2 lat1))
            dlon (Math/toRadians (- lon2 lon1))
            lat1-rad (Math/toRadians lat1)
            lat2-rad (Math/toRadians lat2)
            a (+ (Math/pow (Math/sin (/ dlat 2)) 2)
                 (* (Math/cos lat1-rad)
                    (Math/cos lat2-rad)
                    (Math/pow (Math/sin (/ dlon 2)) 2)))
            c (* 2 (Math/atan2 (Math/sqrt a)
                               (Math/sqrt (- 1 a))))]
           (* R c)))
