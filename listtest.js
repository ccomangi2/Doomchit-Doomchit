var arrNumber = new Array();
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

  storageRef
    .child('wavFiles')
    .listAll()
    .then(function(res){
        res.items.forEach(function(ref){
        i++;  
        displaylist(i,ref)
    });
  })
  var j=-1

  function displaylist(row, audio){
    audio.getDownloadURL().then(function(url){
        let htmlStr='';
        arrNumber.push(url)
               j++;
                htmlStr += "<div class='box'>";
                htmlStr+=
                    "<div class='song_title' id='song_title'>"+
                    audio.name.split('_')[2]+
                    ".wav"+
                    "</div>"
                htmlStr+=
                    "<div class='composer'>"+
                    audio.name.split('_')[3].split('.')[0]+
                    "</div>"
                htmlStr+=
                    "<div class='music_length'>"+audio.name.split('_')[1]+"초"+"</div>";
                htmlStr+=
                    "<div class='share' id='"+arrNumber[j]+"' ><img src='img/web_share.png' alt='Share on Facebook'></div>";
                   
                htmlStr+="<div class='play' id='"+arrNumber[j]+"' >";
                htmlStr+="<img src='img/web_playsound.png' alt='play sound button'/></div></div>";

           

            $('#container').append(htmlStr);
            $('.play').click(function(){
              console.log("들감")
              window.open($(this).attr('id'), '둠칫둠칫','height=100,width=200,toolbar=no');
            })
    
           
            $(".share").click(function(){
              var url=$(this).attr('id')
              var textarea = document.createElement("textarea");
              document.body.appendChild(textarea);
              textarea.value = url;
              console.log(textarea.value)
              textarea.select();
              document.execCommand("copy");
              document.body.removeChild(textarea);
              window.open("http://www.facebook.com/share.php", '둠칫둠칫','height=250,width=300,toolbar=no');
            });

            });
        }
        
        
      };
