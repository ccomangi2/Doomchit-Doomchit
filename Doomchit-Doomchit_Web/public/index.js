var firebaseConfig = {
    apiKey: "AIzaSyDp0Ih07F0aTZltrmeWoOhQkNjcAri4CzU",
    authDomain: "doomchit-doomchit.firebaseapp.com",
    databaseURL: "https://doomchit-doomchit-default-rtdb.asia-southeast1.firebasedatabase.app",
    projectId: "doomchit-doomchit",
    storageBucket: "doomchit-doomchit.appspot.com",
    messagingSenderId: "898978285254",
    appId: "1:898978285254:web:52e2e11e3770163bcf39c7",
    measurementId: "G-B089KPEVS5"
};

firebase.initializeApp(firebaseConfig);
var a=0
const final=firebase.storage().ref().child(`test`)
final.listAll().then(function(res) {
    res.items.forEach(function(itemRef) {
        itemRef.getDownloadURL().then(function(url) {
            console.log(url);
            a+=1
            console.log(a);
            
        })
    })
})
         