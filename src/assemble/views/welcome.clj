(ns assemble.views.welcome
  (:require [assemble.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core]))

(defpage "/" []
  (common/layout 
    [:div {:id "title"} 
      [:div {:class "title-placement"}
        [:div {:class "title-text"} "assemble"]
      ]
    ]
    [:div {:id "subtitle"} "your workplace, evolved"]
    [:div {:id "mission-statement"}
      [:div {:class "mission"}
        [:p "We believe that thoughtfully designed & serviced workplaces enhance productivity, inspire worker satisfaction and
             ultimately contribute to exceptional business performance. It is with this focus that we provide professional work 
             environments for a curated community of likeminded members and do so with pricing that allows us to thrive together."]
        [:p "We invite our members to let us know if we deviate from our path, knowing that shared success is a team effort."]
      ] 
    ]
    ))
