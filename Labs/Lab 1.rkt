;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname |Lab 1|) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f ())))
;a person is (make-person string age symbol number string
(define-struct person(name grade gender age town))

(define JACOB(make-person "Jacob" 13 'male 17 "Medway"))
(define GRAHAMMY(make-person "Grahammy" 10 'female 15 "Medway"))
(define TREEVOR(make-person "Treevor" 10 'male 15 "The Enchanted Forest"))
(define COOPEAR(make-person "Coopear" 12 'male 17 "Farmtown"))
(define MIKKILL(make-person "Mikkil" 12 'male 17 "Detroit"))
(define LUCO(make-person "Luco" 10 'male 15 "Google"))

(define LOP (list JACOB GRAHAMMY TREEVOR COOPEAR MIKKILL LUCO))


#|TEMPLATE FOR PERSON
;person-func: person -> ...
;consumes a person and produces ...
(define (person-func person)
  (person-name person)
  (person-grade person)
  (person-gender person)
  (person-age person)
  (person-town person))
|#

;a list of person is 
;empty or
;(cons person list-of-person

#|TEMPLATE FOR LIST OF PERSON
;lop-func: lop -> ...
;consumes a list-of-person and produces ...
(define (lop-func lop)
  (cond
    [(empty? lop)...]
    [(cons? lop)
     (person-func (first lop))(lop-func (rest lop))]))
|#

(check-expect (older JACOB)(make-person "Jacob" 13 'male 18 "Medway"))
(check-expect (older GRAHAMMY)(make-person "Grahammy" 10 'female 16 "Medway"))
;older: person -> person
;consumes a person and produces a person that is one year older
(define (older person)
  (make-person
   (person-name person)
   (person-grade person)
   (person-gender person)
   (+(person-age person)1)
   (person-town person)))

(check-expect (move JACOB "Cuba City")(make-person "Jacob" 13 'male 17 "Cuba City"))
(check-expect (move GRAHAMMY "North Pole")(make-person "Grahammy" 10 'female 15 "North Pole"))
;move: person nt -> person
;consumes a person and a string and produces a person that has moved to the string
(define (move person nt)
  (make-person
   (person-name person)
   (person-grade person)
   (person-gender person)
   (person-age person)
   nt 
   ))

(check-expect (older2 JACOB)(make-person "Jacob" 14 'male 17 "Medway"))
(check-expect (older2 GRAHAMMY)(make-person "Grahammy" 11 'female 15 "Medway"))
;older2: person -> person
;consumes a person and produces a person one grade higher
(define (older2 person)
  (make-person
   (person-name person)
   (+(person-grade person)1)
   (person-gender person)
   (person-age person)
   (person-town person)))

(check-expect (graduated? JACOB)true)
(check-expect (graduated? GRAHAMMY)false)
;graduated?: person -> boolean
;consumes a person and determines if the person has graduated
(define (graduated? person)
  (if (>(person-grade person)12) true false))

(check-expect (title JACOB)"Mr. Jacob")
(check-expect (title GRAHAMMY)"Ms. Grahammy")
;title: person -> string
;consumes a person and adds a title to their name depending on their gender
(define (title person)
  (if (eq? (person-gender person) 'male)(string-append "Mr. "(person-name person))(string-append "Ms. "(person-name person))))

(check-expect (adv JACOB)(make-person "Jacob" 14 'male 18 "Boston"))
(check-expect (adv GRAHAMMY)(make-person "Grahammy" 11 'female 16 "Medway"))
(check-expect (adv LUCO)(make-person "Luco" 11 'male 16 "Google"))
;adv: person -> person
;consumes a person and produces an advance person
(define (adv person)
  (make-person
   (person-name person)
   (+(person-grade person)1)
   (person-gender person)
   (+(person-age person)1)
   (if(>=(person-grade person)12)"Boston"(person-town person))))

(check-expect (advance empty)empty)
(check-expect (advance LOP) (list
                             (make-person "Jacob" 14 'male 18 "Boston")
                             (make-person "Grahammy" 11 'female 16 "Medway")
                             (make-person "Treevor" 11 'male 16 "The Enchanted Forest")
                             (make-person "Coopear" 13 'male 18 "Boston")
                             (make-person "Mikkil" 13 'male 18 "Boston")
                             (make-person "Luco" 11 'male 16 "Google")))
;advance: lop ->  lop
;consumes a list of person and produces an advanced list of person
(define (advance lop)
  (cond
    [(empty? lop)empty]
    [(cons? lop)
     (cons (adv (first lop))(advance (rest lop)))]))
  
  
