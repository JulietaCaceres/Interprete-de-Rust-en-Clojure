(ns tp.core-test
  (:require [clojure.test :refer :all]
            [tp.core :refer :all]))

(deftest dividir-test
  (testing "Prueba de la funcion: dividir"
    (is (= 4 (dividir 12 3)))
    (is (= 4.0 (dividir 12.0 3)))
    (is (= 4.0 (dividir 12.0 3.0)))
    (is (= 0 (dividir 1 2)))
    (is (= 0.5 (dividir 1 2.0)))
    )
  ))