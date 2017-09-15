(ns learn-clojure.core)

(defn gen-matrix-line [n one-position]
  (let [line (vec (take n (repeat 0)))]
    (assoc line one-position 1)))

(defn gen-identity-matrix [n]
  (let [n-range (range n)]
    (vec (for [i n-range]
           (gen-matrix-line n i)))))
