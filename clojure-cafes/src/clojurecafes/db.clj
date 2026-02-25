(ns clojurecafes.db)

(def cafes
 [{:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:macha :americano :cortado :latte :espresso :cappuccino}
   :name "Kafeterija Dorćol"
   :coffee-until 22
   :id 1
   :pet :yes
   :ambience :cozy
   :lat 44.821494351797654
   :smoke :smoke
   :location "Stari Grad"
   :open-until 22
   :lng 20.468774709829248}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Kafeterija Studentski Trg"
   :coffee-until 22
   :id 2
   :pet :yes
   :ambience :cozy
   :lat 44.8205
   :smoke :smoke
   :location "Stari Grad"
   :open-until 22
   :lng 20.457}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :filter :cappuccino}
   :name "Kafeterija Magazin 1907"
   :coffee-until 23
   :id 3
   :pet :yes
   :ambience :cozy
   :lat 44.818
   :smoke :smoke
   :location "Stari Grad"
   :open-until 23
   :lng 20.4575}
  {:milk #{:oat :soy :coconut}
   :to-go :no
   :coffee #{:americano :espresso :filter :cappuccino}
   :name "Pržionica D59B"
   :coffee-until 22
   :id 4
   :pet :yes
   :ambience :trendy
   :lat 44.81
   :smoke :smoke
   :location "Stari Grad"
   :open-until 22
   :lng 20.475}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Caffe Factory"
   :coffee-until 23
   :id 5
   :pet :yes
   :ambience :work
   :lat 44.812
   :smoke :smoke
   :location "Vračar"
   :open-until 23
   :lng 20.471}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Coffeedream"
   :coffee-until 23
   :id 6
   :pet :yes
   :ambience :cozy
   :lat 44.8202
   :smoke :smoke
   :location "Stari Grad"
   :open-until 23
   :lng 20.456}
  {:milk #{:oat :soy}
   :to-go :no
   :coffee #{:espresso :filter :cappuccino}
   :name "Baristocratia Coffee Society"
   :coffee-until 23
   :id 7
   :pet :yes
   :ambience :trendy
   :lat 44.8108
   :smoke :smoke
   :location "Vračar"
   :open-until 23
   :lng 20.4678}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:espresso :filter :cappuccino}
   :name "Simbol Specialty Coffee"
   :coffee-until 18
   :id 8
   :pet :yes
   :ambience :work
   :lat 44.817
   :smoke :smoke
   :location "Stari Grad"
   :open-until 18
   :lng 20.457}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Way Cup Kafeterija"
   :coffee-until 21
   :id 9
   :pet :yes
   :ambience :cozy
   :lat 44.8135
   :smoke :smoke
   :location "Stari Grad"
   :open-until 21
   :lng 20.463}
  {:milk #{:oat :soy}
   :coffee #{:americano :latte :espresso :cappuccino}
   :name "The Cups Coffee House"
   :coffee-until 19
   :id 10
   :pet :yes
   :ambience :cozy
   :lat 44.815
   :smoke :smoke
   :location "Stari Grad"
   :open-until 19
   :lng 20.464}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:americano :latte :espresso :cappuccino}
   :name "Coca Dream Venizelosova"
   :coffee-until 23
   :id 11
   :pet :yes
   :ambience :cozy
   :lat 44.816
   :smoke :smoke
   :location "Stari Grad"
   :open-until 23
   :lng 20.464}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:irish :nes :latte :espresso :mocha :cappuccino}
   :name "Blaznavac"
   :coffee-until 24
   :id 12
   :pet :yes
   :ambience :cozy
   :lat 44.81995358150138
   :smoke :smoke
   :location "Stari Grad"
   :open-until 24
   :lng 20.461835209436106}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:americano :latte :espresso :mocha :cappuccino}
   :name "Coffee Dream Stari Grad"
   :coffee-until 23.5
   :id 13
   :pet :yes
   :ambience :cozy
   :lat 44.81794587022444
   :smoke :smoke
   :location "Stari Grad"
   :open-until 23.5
   :lng 20.457969683512694}
  {:milk #{:oat :soy}
   :to-go :no
   :coffee #{:americano :espresso :cappuccino}
   :name "Ljubica"
   :coffee-until 24
   :id 14
   :pet :yes
   :ambience :cozy
   :lat 44.82117170613017
   :smoke :smoke
   :location "Stari Grad"
   :open-until 24
   :lng 20.462475791104403}
  {:milk #{:oat :soy}
   :to-go :no
   :coffee #{:nes :latte :espresso :cappuccino}
   :name "Kafeterija Neimar"
   :coffee-until 22
   :id 15
   :pet :yes
   :ambience :cozy
   :lat 44.79400296228253
   :smoke :smoke
   :location "Vračar"
   :open-until 22
   :lng 20.473157225245124}
  {:milk #{:oat :soy}
   :to-go :no
   :coffee #{:nes :espresso :filter :cappuccino}
   :name "7am Roasters Neimar"
   :coffee-until 18
   :id 16
   :pet :yes
   :ambience :work
   :lat 44.80664091133439
   :smoke :smoke
   :location "Vračar"
   :open-until 18
   :lng 20.4724941}
  {:milk #{:oat :soy}
   :to-go :no
   :coffee #{:nes :espresso :filter :cappuccino}
   :name "Baristocratia Coffee Society"
   :coffee-until 23
   :id 17
   :pet :yes
   :ambience :trendy
   :lat 44.8108
   :smoke :smoke
   :location "Vračar"
   :open-until 23
   :lng 20.4678}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :cappuccino}
   :name "Holy Beans"
   :coffee-until 17
   :id 18
   :pet :no
   :ambience :trendy
   :lat 44.8175
   :smoke :smoke
   :location "Centar"
   :open-until 17
   :lng 20.4575}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Kafeterija Sava Centar"
   :coffee-until 21
   :id 19
   :pet :yes
   :ambience :cozy
   :lat 44.7968
   :smoke :smoke
   :location "Savski venac"
   :open-until 21
   :lng 20.4534}
  {:milk #{:oat :soy}
   :to-go :no
   :coffee #{:americano :espresso :cappuccino}
   :name "Kafeterija Gardoš"
   :coffee-until 22
   :id 20
   :pet :yes
   :ambience :cozy
   :lat 44.85317620361723
   :smoke :smoke
   :location "Zemun"
   :open-until 22
   :lng 20.414388368524737}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Kafeterija Zemun"
   :coffee-until 22
   :id 21
   :pet :yes
   :ambience :cozy
   :lat 44.86169412373176
   :smoke :smoke
   :location "Zemun"
   :open-until 22
   :lng 20.38417596810156}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Kafeterija Banovo Brdo"
   :coffee-until 22
   :id 22
   :pet :yes
   :ambience :cozy
   :lat 44.77613950761957
   :smoke :smoke
   :location "Banovo Brdo"
   :open-until 22
   :lng 20.4132098386619}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :cappuccino}
   :name "Holy Beans Bulevar"
   :coffee-until 20
   :id 23
   :pet :no
   :ambience :trendy
   :lat 44.80541366521654
   :smoke :smoke
   :location "Zvezdara"
   :open-until 20
   :lng 20.47532716422432}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:americano :latte :espresso :cappuccino}
   :name "Ginger Bar"
   :coffee-until 22
   :id 24
   :pet :yes
   :ambience :cozy
   :lat 44.82030068276317
   :smoke :smoke
   :location "Stari Grad"
   :open-until 24
   :lng 20.471204272684734}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Kafeterija Voždovac"
   :coffee-until 22
   :id 25
   :pet :yes
   :ambience :cozy
   :lat 44.772056663906895
   :smoke :smoke
   :location "Voždovac"
   :open-until 22
   :lng 20.475880672439377}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:americano :espresso :cappuccino}
   :name "Kafeterija Mlin Voždovac"
   :coffee-until 23
   :id 26
   :pet :no
   :ambience #{:work :cozy}
   :lat 44.775242246620365
   :smoke :smoke
   :location "Voždovac"
   :open-until 23
   :lng 20.48141628176198}
  {:milk #{:oat :soy}
   :to-go :no
   :coffee #{:latte :espresso :filter :cappuccino}
   :name "Holy Beans Voždovac"
   :coffee-until 23
   :id 27
   :pet :yes
   :ambience :cozy
   :lat 44.77743565152988
   :smoke :no-smoke
   :location "Voždovac"
   :open-until 23
   :lng 20.47660976351284}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Java Coffee Roastery"
   :coffee-until 22
   :id 28
   :pet :yes
   :ambience :cozy
   :lat 44.78844095383016
   :smoke :smoke
   :location "Čukarica"
   :open-until 22
   :lng 20.42154742691103}
  {:milk #{:oat :soy}
   :to-go :yes
   :coffee #{:latte :espresso :cappuccino}
   :name "Kafeterija West 65"
   :coffee-until 22
   :id 29
   :pet :yes
   :ambience :cozy
   :lat 44.81305972955327
   :smoke :smoke
   :location "Novi Beograd"
   :open-until 22
   :lng 20.400077322146657}])
