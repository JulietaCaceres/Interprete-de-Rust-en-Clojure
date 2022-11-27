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
  )

(deftest compatibles?-test
  (testing "Prueba de la funcion: compatibles?"
    (is (= true (compatibles? 'i64 5)))
    (is (= false (compatibles? 'i64 5.0)))
    (is (= true (compatibles? 'i64 [5.0])))
    (is (= true (compatibles? 'f64 5.0)))
    (is (= false (compatibles? 'f64 5)))
    (is (= true (compatibles? 'String "Hola")))
    (is (= false (compatibles? 'bool "Hola")))
    (is (= true (compatibles? 'bool true)))
    (is (= true (compatibles? 'usize 1)))
    (is (= true (compatibles? 'char 'a)))
    (is (= true (compatibles? 'char ['a])))
    )
  )

(deftest pasar-a-int-test
  (testing "Prueba de la funcion: pasar-a-int?"
    (is (= 10 (pasar-a-int "10")))
    (is (= "a" (pasar-a-int "a")))
    (is (= 10 (pasar-a-int 10.0)))
    (is (= 10 (pasar-a-int 10)))
    (is (= 'a (pasar-a-int 'a)))
    (is (= [10.0] (pasar-a-int [10.0])))
    )
  )

(deftest pasar-a-float-test
  (testing "Prueba de la funcion: pasar-a-float"
    (is (= 10.0 (pasar-a-float "10")))
    (is (= "a" (pasar-a-float "a")))
    (is (= 10.0 (pasar-a-float 10)))
    (is (= 10.0 (pasar-a-float 10.0)))
    (is (= 'a (pasar-a-float 'a)))
    (is (= [10] (pasar-a-float [10])))
    )
  )

(deftest palabra-reservada?-test
  (testing "Prueba de la funcion: palabra-reservada?"
    (is (= true  (palabra-reservada? 'while)))
    (is (= false (palabra-reservada? 'until)))
    (is (= false (palabra-reservada? 13)))
    )
  )

(deftest identificador?-test
  (testing "Prueba de la funcion: identificador?"
    (is (= true  (identificador? 'boolean)))
    (is (= false (identificador? 'bool)))
    (is (= true (identificador? 'e120)))
    (is (= false (identificador? '12e0)))
    )
  )