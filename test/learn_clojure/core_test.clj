(ns learn-clojure.core-test
  (:require [clojure.test :refer :all]
            [learn-clojure.core :as c]))

(deftest gen-matrix-line-test
  (testing "Testing line generation"
    (is (= [0 0 1 0 0]
           (c/gen-matrix-line 5 2)))
    (is (= [1]
           (c/gen-matrix-line 0 0)))))

(deftest gen-identity-matrix-test
  (testing "Testing identity matrix generation"
    (is (= [[1 0 0 0 0] [0 1 0 0 0] [0 0 1 0 0] [0 0 0 1 0] [0 0 0 0 1]]
           (c/gen-identity-matrix 5)))
    (is (= []
           (c/gen-identity-matrix 0)))))
