(ns assemble.views.welcome
  (:require [assemble.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core]))

(defpage "/" []
  (common/layout
    [:div {:id "title"}
      [:div {:class "title-placement"}
        [:h1 {:class "title-text"} "assemble"]
      ]
    ]
    [:div {:id "subtitle"}
      [:div {:class "subtitle-text"}
        "where work comes together"]]
    [:div {:id "mission-statement"}
      [:div {:class "mission"}
        [:p "In a world where you can work where and whenever you want, you don't need an office."]
        [:p "Unless of course, it's simply your favorite place to be:"]
        [:blockquote {:class "mission_points"}
          "Productive"
          [:br]
          "Inspired"
          [:br]
          "Comfortable"
          [:br]
          "Welcome" 
        ]
        [:p "That place is "
         [:span {:class "assemble_title"} "assemble"]
         "."]
        [:p "Coming soon to Arlington, VA."]
        [:p [:a {:href "mailto:membership@assemble.com"} "membership@assemble.com"]]
      ]
    ]
    ))
