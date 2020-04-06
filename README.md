# MsgToWeb_MobileApp
Android app to read sms and send to local server


> The goal of this application is to 
> show __Sim based SMS__ to show up in 
> a website to read SMS contents for 
> automation testing,etc.
> This is Mobile app part to read  
> SMS and to send SMS to server 
> running in same network


### Tech 🚀

* [Java] for Android
* [XML] - for design

### Mobile app

https://github.com/mallikarjuna-sharma/MsgToWeb_MobileApp/raw/master/app/build/outputs/apk/debug/MsgToWeb.apk

### Installation 🔗

MsgToWeb_MobileApp requires [Android Studio] v3+ to run.

To build debug apk
menu -> build -> build modules/apk -> build apk 

## Structure ⚓

- MainActivity.java
  - To request permission for to read SmS 
  - show inital loader to wait for message
- MyReceiver.java
  - To read received local sim sms
- MessageActivity.java
  - To read network ip address in mobile
  - To send received message to local server
  - To show message status

### Contributing 🙌

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

### Upcoming Features / Improvements 

- [x] UI enhancements 

## Contributors ✨
<table>
  <tr>
    <td align="center">
      <a href="https://www.instagram.com/rmalliksharma96/">
        <img src="https://instagram.fmaa2-2.fna.fbcdn.net/v/t51.2885-19/s150x150/16585653_614441548749035_750547953042587648_a.jpg?_nc_ht=instagram.fmaa2-2.fna.fbcdn.net&_nc_ohc=XsxHJ-GipCMAX-ERkfm&oh=0cee67d1a727952e08a31a96e0b401c6&oe=5EB20A83" width="100px" alt="" />
        <br />
        <sub><b>Mallikarjuna Sharma</b></sub>
      </a>
      <br />
    </td>
    <td align="center">
      <a href="https://www.instagram.com/ts_achu/">
        <img src="https://banner2.cleanpng.com/20180920/yko/kisspng-computer-icons-portable-network-graphics-avatar-ic-5ba3c66df14d32.3051789815374598219884.jpg" width="100px" alt="" />
        <br />
        <sub><b>Achu_ts</b></sub>
      </a>
      <br />
    </td>
  </tr>
</table>

## Sharing 💗

Project is open source. Feel free to make your own version. All you need to do is to fork this repository, edit [src/MsgToWeb.jsx] and server.js . Mark star ⭐ if you like the project.

