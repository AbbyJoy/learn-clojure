(ns learn-clojure.core)

(defn gen-matrix-line [n one-position]
  (let [line (vec (take n (repeat 0)))]
    (assoc line one-position 1)))

;; Old approach
;; (defn gen-identity-matrix [n]
;;   (let [n-range (range n)]
;;     (vec (for [i n-range]
;;            (gen-matrix-line n i)))))

;; concat,iterate, partition
;; (take 12(apply concat (repeat [1 0 0])))
;; => (1 0 0 1 0 0 1 0 0 1 0 0)
;; (take 3 (partition 3 (repeat 0)))
;; => ((0 0 0) (0 0 0) (0 0 0))

;;Infinite Sequence Approach

;; (defn gen-identity-matrix [n]
;;   (let [line (assoc (vec (take (+ n 1) (repeat 0))) 0 1)]
;;     (vec (take n (map vec (partition n (apply concat (repeat line))))))))

(defn gen-identity-matrix [n]
  (let [line (assoc (vec (take (+ n 1) (repeat 0))) 0 1)]
    (->> (repeat line)
         (apply concat)
         (partition n)
         (map vec)
         (take n)
         (vec))))
