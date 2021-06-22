

window.onload=function(){
  this.getdata();
}


function getdata(){
  var firebaseConfig = {
    apiKey: 'AIzaSyDp0Ih07F0aTZltrmeWoOhQkNjcAri4CzU',
    authDomain: 'doomchit-doomchit.firebaseapp.com',
    databaseURL: 'https://doomchit-doomchit-default-rtdb.asia-southeast1.firebasedatabase.app',
    projectId: 'doomchit-doomchit',
    storageBucket: 'doomchit-doomchit.appspot.com',
    messagingSenderId: '898978285254',
    appId: '1:898978285254:web:52e2e11e3770163bcf39c7',
    measurementId: 'G-B089KPEVS5'
  };
firebase.initializeApp(firebaseConfig);

var storage=firebase.storage();
var storageRef=storage.ref();
var i=0;

storageRef.child('wavFiles').listAll().then(function(res){
  res.items.forEach(function(ref){
  i++;  
  displaylist(i,ref)
  
  });
})
function displaylist(row, audio){
  audio.getDownloadURL().then(function(url){
    console.log(url);
    let htmlStr='';
    
htmlStr += "<div class='box'>";
htmlStr+="<div class='song_title' id='song_title'>"+audio.name.split('_')[2]+".wav"+"</div>"
htmlStr+="<div class='composer'>"+audio.name.split('_')[3].split('.')[0]+"</div>"
htmlStr+="<div class='music_length'>"+audio.name.split('_')[1]+"초"+"</div>";
htmlStr+="<div class='share' onclick='window.open('https://www.facebook.com/sharer/sharer.php');'><img src='img/web_share.png' alt='Share on Facebook'></div>";
htmlStr+='<div class="play" onclick="window.open(url)"><img src="img/web_playsound.png" alt="play sound button"/></div>';
htmlStr+="</div>";
$('#container').append(htmlStr);


  });


}
};
