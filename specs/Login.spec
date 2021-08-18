Login Spec
==========================
tags: RestaurantCases,AllTest

* Open the Yemeksepeti homepage
* Go to Yemek Sepeti City Page

Wrong Username and Password Login
-----------
tags:WrongMailAndPass
* Enter Login with "johndoe@gmail.com" and "123456"
* Check "Hatalı giriş" for failed login

Correct username and wrong password login test
-----------
tags:WrongPass
* Enter Login with "kendiebru@gmail.com" and "123456"
* Check "Hatalı giriş" for failed login

Empty username and password login test
-----------
tags:Emptyuserandpass
* Enter Login with "" and ""
* Check "Lütfen kullanıcı adınızı/e-postanızı giriniz" for "mail" null charachter login
* Check "Lütfen şifrenizi giriniz." for "pass" null charachter login

Wrong username and empty password login test
-----------
tags:Nullpass
* Enter Login with "ebru" and ""
* Check "Lütfen şifrenizi giriniz." for "pass" null charachter login

Correct username and empty password login test
-----------
tags:Nullpass
* Enter Login with "kendiebru@gmail.com" and ""
* Check "Lütfen şifrenizi giriniz." for "pass" null charachter login

Empty username and wrong password login test
-----------
tags:Nullpass
* Enter Login with "" and "123456"
* Check "Lütfen kullanıcı adınızı/e-postanızı giriniz" for "mail" null charachter login

Wrong username and correct password login test
-----------
tags:wrongusercorrectpass
* Enter Login with "asd" and "123456"
* Check "Hatalı giriş" for failed login

Successful Login
-----------
tags:SucCase
* Enter Login with "kendiebru@gmail.com" and "Eskela123!"
* Check "Ebru Gülek" After Login
