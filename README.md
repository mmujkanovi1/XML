# XML

Application in spring boot that calls earlier made API, with response as a xml string and instruction which file to make(name).When app get the response, must to create xml file somewhere on disc with xml content from response body.

### Client requers: ###
* to be able to install the app
* that after installation process application start immediately after starting the machine
* that he have config file in which he can specify:
  * path on the disc where he want create xml file,
  * API url who was called and at what time(as cron expression)
