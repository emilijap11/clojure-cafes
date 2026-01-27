(ns clojurecafes.db)

(def cafes
  [
   {:id 1
    :name "Kafeterija Dorćol"
    :location "Stari Grad"
    :lat 44.821494351797654
    :lng 20.468774709829248

    :coffee #{:espresso :latte :cappuccino :cortado :americano :macha}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 22
    :coffee-until 22
    :smoke :smoke
    :pet :yes
    :to-go :yes}

   {:id 2
    :name "Kafeterija Studentski Trg"
    :location "Stari Grad"
    :lat 44.8205
    :lng 20.4570
    :coffee #{:espresso :latte :cappuccino }
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 22
    :coffee-until 22
    :smoke :smoke
    :pet :yes
    :to-go :yes}


   {:id 3
    :name "Kafeterija Magazin 1907"
    :location "Stari Grad"
    :lat 44.8180
    :lng 20.4575
    :coffee #{:espresso :latte :filter :cappuccino}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 23
    :coffee-until 23
    :smoke :smoke
    :pet :yes
    :to-go :yes}

   {:id 4
    :name "Pržionica D59B"
    :location "Stari Grad"
    :lat 44.8100
    :lng 20.4750
    :coffee #{:espresso :filter :americano :cappuccino}
    :milk #{:oat :coconut :soy}
    :ambience :trendy
    :open-until 22
    :coffee-until 22
    :smoke :smoke
    :pet :yes
    :to-go :no}

   {:id 5
    :name "Caffe Factory"
    :location "Vračar"
    :lat 44.8120
    :lng 20.4710
    :coffee #{:espresso :latte :cappuccino}
    :milk #{:oat :soy}
    :ambience :work
    :open-until 23
    :coffee-until 23
    :smoke :smoke
    :pet :yes
    :to-go :yes}

   {:id 6
    :name "Coffeedream"
    :location "Stari Grad"
    :lat 44.8202
    :lng 20.4560
    :coffee #{:espresso :latte :cappuccino}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 23
    :coffee-until 23
    :smoke :smoke
    :pet :yes
    :to-go :yes}

   {:id 7
    :name "Baristocratia Coffee Society"
    :location "Vračar"
    :lat 44.8108
    :lng 20.4678
    :coffee #{:espresso :filter :cappuccino}
    :milk #{:oat :soy }
    :ambience :trendy
    :open-until 23
    :coffee-until 23
    :smoke :smoke
    :pet :yes
    :to-go :no}

   {:id 8
    :name "Simbol Specialty Coffee"
    :location "Stari Grad"
    :lat 44.8170
    :lng 20.4570
    :coffee #{:espresso :filter :cappuccino}
    :milk #{:oat :soy}
    :ambience :work
    :open-until 18
    :coffee-until 18
    :smoke :smoke
    :pet :yes
    :to-go :yes}

   {:id 9
    :name "Way Cup Kafeterija"
    :location "Stari Grad"
    :lat 44.8135
    :lng 20.4630
    :coffee #{:espresso :latte :cappuccino}
    :milk #{:oat :soy }
    :ambience :cozy
    :open-until 21
    :coffee-until 21
    :smoke :smoke
    :pet :yes
    :to-go :yes}

   {:id 10
    :name "The Cups Coffee House"
    :location "Stari Grad"
    :lat 44.8150
    :lng 20.4640
    :coffee #{:espresso :latte :americano :cappuccino}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 19
    :coffee-until 19
    :smoke :smoke
    :pet :yes}
   {:id 11
    :name "Coca Dream Venizelosova"
    :location "Stari Grad"
    :lat 44.8160 :lng 20.4640
    :coffee #{:espresso :latte :americano :cappuccino}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 23
    :coffee-until 23
    :smoke   :smoke
    :pet :yes
    :to-go :yes}

   {:id 12
    :name "Blaznavac"
    :location "Stari Grad"
    :lat  44.81995358150138
    :lng 20.461835209436106
    :coffee #{:espresso :mocha :latte :irish :nes :cappuccino}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 24
    :coffee-until 24
    :smoke :smoke
    :pet :yes
    :to-go :yes}
   {:id 13
    :name "Coffee Dream Stari Grad"
    :location "Stari Grad"
    :lat 44.81794587022444 :lng 20.457969683512694
    :coffee #{:espresso :latte :americano :mocha :cappuccino}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 23.5
    :coffee-until 23.5
    :smoke :smoke
    :pet :yes
    :to-go :yes}
   {:id 14
    :name "Ljubica"
    :location "Stari Grad"
    :lat 44.82117170613017
    :lng 20.462475791104403
    :coffee #{:espresso :americano :cappuccino}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 24
    :coffee-until 24
    :smoke :smoke
    :pet :yes
    :to-go :no}
   {:id 15
    :name "Kafeterija Neimar"
    :location "Vračar"
    :lat 44.79400296228253
    :lng 20.473157225245124
    :coffee #{:espresso :latte :nes :cappuccino}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 22
    :coffee-until 22
    :smoke :smoke
    :pet :yes
    :to-go :no}



   {:id 16
    :name         "7am Roasters Neimar"
    :location "Vračar"
    :lat 44.80664091133439
    :lng 20.4724941
    :coffee #{:espresso :filter :nes :cappuccino}
    :milk #{:oat :soy}
    :ambience :work
    :open-until   18
    :coffee-until 18
    :smoke     :smoke
    :pet          :yes
    :to-go        :no}

   {:id           17
    :name         "Baristocratia Coffee Society"
    :location     "Vračar"
    :lat 44.8108
    :lng 20.4678
    :coffee       #{:espresso :filter :nes :cappuccino}
    :milk         #{:oat :soy }
    :ambience     :trendy
    :open-until   23
    :coffee-until 23
    :smoke     :smoke
    :pet          :yes
    :to-go        :no}


   {:id           18
    :name         "Holy Beans"
    :location     "Centar"
    :lat          44.8175
    :lng          20.4575
    :coffee       #{:latte :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :trendy
    :open-until   17
    :coffee-until 17
    :smoke     :smoke
    :pet          :no
    :to-go        :yes}




   {:id           19
    :name         "Kafeterija Sava Centar"
    :location     "Savski venac"
    :lat          44.7968
    :lng          20.4534
    :coffee       #{:espresso :latte :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :cozy
    :open-until   21
    :coffee-until 21
    :smoke    :smoke
    :pet          :yes
    :to-go        :yes}
   {:id           20
    :name         "Kafeterija Gardoš"
    :location     "Zemun"
    :lat          44.85317620361723
    :lng          20.414388368524737
    :coffee       #{:espresso :americano :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :cozy
    :open-until   22
    :coffee-until 22
    :smoke      :smoke
    :pet          :yes
    :to-go        :no}
   {:id           21
    :name         "Kafeterija Zemun"
    :location     "Zemun"
    :lat          44.86169412373176
    :lng          20.38417596810156
    :coffee       #{:espresso :latte :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :cozy
    :open-until   22
    :coffee-until 22
    :smoke     :smoke
    :pet          :yes
    :to-go        :yes}
   {:id           22
    :name         "Kafeterija Banovo Brdo"
    :location     "Banovo Brdo"
    :lat          44.77613950761957
    :lng          20.4132098386619
    :coffee       #{:espresso :latte :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :cozy
    :open-until   22
    :coffee-until 22
    :smoke      :smoke
    :pet          :yes
    :to-go        :yes}
   {:id           23
    :name         "Holy Beans Bulevar"
    :location     "Zvezdara"
    :lat          44.80541366521654
    :lng          20.47532716422432
    :coffee       #{:latte :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :trendy
    :open-until   20
    :coffee-until 20
    :smoke      :smoke
    :pet          :no
    :to-go        :yes}
   {:id           24
    :name         "Ginger Bar"
    :location     "Stari Grad"
    :lat          44.82030068276317
    :lng          20.471204272684734
    :coffee       #{:espresso :latte :americano :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :cozy
    :open-until   24
    :coffee-until 22
    :smoke      :smoke
    :pet          :yes
    :to-go        :yes}
   {:id           25
    :name         "Kafeterija Voždovac"
    :location     "Voždovac"
    :lat          44.772056663906895,
    :lng          20.475880672439377
    :coffee       #{:espresso :latte :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :cozy
    :open-until   22
    :coffee-until 22
    :smoke      :smoke
    :pet          :yes
    :to-go        :yes}



   {:id 26
    :name "Kafeterija Mlin Voždovac"
    :location "Voždovac"
    :lat 44.775242246620365
    :lng  20.48141628176198
    :coffee       #{:espresso :americano :cappuccino}
    :milk         #{:oat :soy}
    :ambience     #{ :work :cozy}
    :open-until   23
    :coffee-until 23
    :smoke      :smoke
    :pet          :no
    :to-go        :yes}

   {:id        27
    :name "Holy Beans Voždovac"
    :location "Voždovac"
    :lat 44.77743565152988
    :lng 20.47660976351284
    :coffee #{:espresso :filter :latte :cappuccino}
    :milk #{:oat :soy}
    :ambience :cozy
    :open-until 23
    :coffee-until 23
    :smoke :no-smoke
    :pet :yes
    :to-go :no}



   {:id           28
    :name         "Java Coffee Roastery"
    :location     "Čukarica"
    :lat          44.78844095383016
    :lng          20.42154742691103
    :coffee       #{:espresso :latte :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :cozy
    :open-until   22
    :coffee-until 22
    :smoke      :smoke
    :pet          :yes
    :to-go        :yes}

   {:id           29
    :name         "Kafeterija West 65"
    :location     "Novi Beograd"
    :lat          44.81305972955327
    :lng          20.400077322146657
    :coffee       #{:espresso :latte :cappuccino}
    :milk         #{:oat :soy}
    :ambience     :cozy
    :open-until   22
    :coffee-until 22
    :smoke      :smoke
    :pet          :yes
    :to-go        :yes}


   ])
