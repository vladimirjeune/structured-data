(ns structured-data)

(defn do-a-thing
  "Uses let to give a name to the common expression (+ x x) in its body"
  [x]
  (let [x2 (+ x x) ]
  (Math/pow x2 x2)  ))

(defn spiff
  "Takes a vector and returns the sum of the first and third elements of the vector"
  [v]
  (let [a (get v 0)
        b (get v 2 )]
    (+ a b)
    )
  )

(defn cutify
  "Takes a vector as a parameter and adds '<3' to its end." ; "<3" cannot be quoted in string
  [v]
  (let [heart "<3"]
    (conj v heart)                 ; conj adds to the end
    )
  )

(defn spiff-destructuring
  "Rewrite our earlier function spiff by destructuring its parameter."
  [v]
  (let [[a no b] v]                       ; No will not be used
    (+ a b) )
  )

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width
  "Return width of a given rectangle using restructuring"
  [rectangle]
  (let [ [[x1 y1][x2 y2]] rectangle ]         ; Vector for let holding vec for rec holding vec for nums
    (int(Math/sqrt (Math/pow (- x1 x2) 2 ) ) )
    )
)

(defn height
  "Return width of a given rectangle using restructuring"
  [rectangle]
  (let [ [[x0 y0] [x1 y1]] rectangle]

    (int (Math/sqrt (Math/pow (- y0 y1) 2)) )       ; Used sq ( (x0 - x1)^2 + (y0 - y1)^2 )
    )
  )

(defn square?
  "Return true if rectangle is a square"
  [rectangle]
  (let [ [[x0 y0] [x1 y1]] rectangle ]
    ( =
      (Math/sqrt (Math/pow (- x0 x1) 2))          ; Width
      (Math/sqrt (Math/pow (- y0 y1) 2))          ; Height, could have used functions
      )
    )
  )

(defn area
  "Write the function (area rectangle) that returns the area of the given rectangle."
  [rectangle]
  (let [ [[x0 y0] [x1 y1]] rectangle
         l                 (int (Math/sqrt (Math/pow (- x0 x1) 2) ) )
         h                 (int (Math/sqrt (Math/pow (- y0 y1) 2) ) ) ]
    (* h l)
    )
  )

(defn contains-point? [rectangle point]
  :-)

(defn contains-rectangle? [outer inner]
  :-)

(defn title-length [book]
  :-)

(defn author-count [book]
  :-)

(defn multiple-authors? [book]
  :-)

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
