(ns contemporary-words.core-test
  (:require [clojure.test :refer :all]
            [contemporary-words.core :refer :all]))

(deftest class-of-1-arg-test
  (testing "class of (random-words 3)"
    (is (= clojure.lang.LazySeq (class (random-words 3))))))

(deftest class-of-2-args-test
  (testing "class of (random-words 3 \" \")"
    (is (= java.lang.String (class (random-words 3 " "))))))

(deftest length-of-1-arg-test
  (testing "length of (random-words 4)"
    (is (= 4 (count (random-words 4))))))

(deftest length-of-2-arg-test
  (testing "length of (random-words 5 \" \")"
    (is (= 5 (count (clojure.string/split
                      (random-words 5 " ")
                      #"\s+"))))))
