(ns clojure-test.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [clojure-test.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
