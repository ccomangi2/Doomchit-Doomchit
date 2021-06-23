Object.defineProperty(Array.prototype, "chunk_inefficient", {
    value: function (chunkSize) {
        var array = this;
        return [].concat.apply(
            [],
            array.map(function (elem, i) {
                return i % chunkSize ? [] : [array.slice(i, i + chunkSize)];
            })
        );
    }
});

var arrNumber = new Array();
window.onload = function () {
    this.getdata();
};

function getdata() {
    var firebaseConfig = {
        apiKey: "AIzaSyDp0Ih07F0aTZltrmeWoOhQkNjcAri4CzU",
        authDomain: "doomchit-doomchit.firebaseapp.com",
        databaseURL:
            "https://doomchit-doomchit-default-rtdb.asia-southeast1.firebasedatabase.app",
        projectId: "doomchit-doomchit",
        storageBucket: "doomchit-doomchit.appspot.com",
        messagingSenderId: "898978285254",
        appId: "1:898978285254:web:52e2e11e3770163bcf39c7",
        measurementId: "G-B089KPEVS5"
    };
    firebase.initializeApp(firebaseConfig);
    var storage = firebase.storage();
    var storageRef = storage.ref();
    var i = 0;

    storageRef
        .child("wavFiles")
        .listAll()
        .then(function (res) {
            res.items.chunk_inefficient(4).forEach(function (chunk, idx) {
                displaylist2(chunk, idx);
            });
            /*
            res.items.forEach(function (ref) {
                i++;
                displaylist(i, ref);
            });*/
        });
    
        var j=-1
    function displaylist2(audios, cIdx) {
        let ulDiv = document.getElementById("image-gallery");
        window.asdf = ulDiv;
        let htmlStr = "";
        htmlStr += "<li data-thumb>";
        htmlStr += `<div id="${cIdx}-audios-container" class="container">`;
        htmlStr += "</div>";
        htmlStr += "</li>";

        ulDiv.insertAdjacentHTML("beforeend", htmlStr);
        
        audios.forEach(function (audio) {
            console.log(audio.getDownloadURL);
            audio.getDownloadURL().then(function (url) {
                arrNumber.push(url);
                j++;
                let container = document.getElementById(
                    `${cIdx}-audios-container`
                );
                console.log(container);

                let boxHtml = "";
                boxHtml += "<div class='box'>";
                boxHtml +=
                    "<div class='song_title' id='song_title'>" +
                    audio.name.split("_")[2] +
                    ".wav" +
                    "</div>";
                boxHtml +=
                    "<div class='composer'>" +
                    audio.name.split("_")[3].split(".")[0] +
                    "</div>";
                boxHtml +=
                    "<div class='music_length'>" +
                    audio.name.split("_")[1] +
                    "초" +
                    "</div>";
                boxHtml +=
                    "<div class='share' id='" +
                    arrNumber[j] +
                    "'><img src='img/web_share.png' alt='Share on Facebook'></div>";
                boxHtml +=
                    "<div class='play' id='" +
                    arrNumber[j] +
                    "' ><img src='img/web_playsound.png' alt='play sound button'/></div>";
                boxHtml += "</div>";

                

                
                container.insertAdjacentHTML("beforeend", boxHtml);
                $('.play').click(function(){
                    console.log("들감")
                    window.open($(this).attr('id'), '둠칫둠칫','height=100,width=200,toolbar=no');
                  })
          
                 
                  $(".share").click(function(){
                    window.open("http://www.facebook.com/share.php?u="+$(this).attr('id'), '둠칫둠칫','height=250,width=300,toolbar=no');
                  });

                // console.log(audio.name.split("_")[2]);
            });
        });
    }

    function displaylist(row, audio) {
        console.log(`row : ${row}`);
        console.log("display list");
        audio.getDownloadURL().then(function (url) {
            arrNumber.push(url);

            let ulDiv = document.getElementById("image-gallery");
            window.asdf = ulDiv;
            // let li = document.createElement("li");
            // li.setAttribute("data-thumb", null);

            // li 두번 도는 포문 안에 박스를 계속 추가하는 포문
            // 박스 추가할때 cnt 1씩 증가, 4이면 li랑 container를 닫아주고
            // li 포문 cnt 1 증가

            let htmlStr = "";
            htmlStr += "<li data-thumb>";
            htmlStr += '<div class="container">';
            htmlStr += "</div>";
            htmlStr += "</li>";
            /*
            let li_cnt = 0;
            let box_cnt = 0;

            let li_for;
            let box_for;

            const maximam = 2;
            for (li_for = 0; li_for < maximam; li_for++) {

                htmlStr += "<li data-thumb>";
                htmlStr += '<div class="container">';

                for (box_for = 1; box_for <= 4; box_for++) {
                    htmlStr += "<div class='box'>";
                    htmlStr +=
                        "<div class='song_title' id='song_title'>" +
                        audio.name.split("_")[2] +
                        ".wav" +
                        "</div>";
                    htmlStr +=
                        "<div class='composer'>" +
                        audio.name.split("_")[3].split(".")[0] +
                        "</div>";
                    htmlStr +=
                        "<div class='music_length'>" +
                        audio.name.split("_")[1] +
                        "초" +
                        "</div>";
                    htmlStr +=
                        "<div class='share' id='" +
                        arrNumber[j] +
                        "'><img src='img/web_share.png' alt='Share on Facebook'></div>";
                    htmlStr +=
                        "<div class='play' id='" +
                        arrNumber[j] +
                        "' ><img src='img/web_playsound.png' alt='play sound button'/></div>";
                    j++;

                    $(".play").click(function () {
                        window.open(
                            $(this).attr("id"),
                            "둠칫둠칫",
                            "height=100,width=180,toolbar=no"
                        );
                    });
                    $(".share").click(function () {
                        window.open(
                            "http://www.facebook.com/share.php?u=" +
                                $(this).attr("id"),
                            "둠칫둠칫",
                            "height=250,width=300,toolbar=no"
                        );
                    });

                    box_cnt += 1;
                    console.log(`box_cnt : ${box_cnt}`);
                }
                if (box_cnt != 0 && box_cnt % 4 == 0) {
                    htmlStr += "</div>";
                    htmlStr += "</li>";
                    // console.log(`box_cnt, box_for end! : ${box_for}`);
                } else {
                    htmlStr += "</div>";
                }
                li_cnt += 1;
                console.log(`li_cnt : ${li_cnt}`);
                
            }
            */
           
            ulDiv.insertAdjacentHTML("beforeend", htmlStr);

            // if (k % 4 == 1) {
            //     htmlStr += "<li data-thumb>";
            //     htmlStr += "<div class='container'>";

            //     console.log(url);
            // }
            // for (let k = 1; k <= 5; k++) {
            //     htmlStr += "<div class='box'>";
            //     htmlStr +=
            //         "<div class='song_title' id='song_title'>" +
            //         audio.name.split("_")[2] +
            //         ".wav" +
            //         "</div>";
            //     htmlStr +=
            //         "<div class='composer'>" +
            //         audio.name.split("_")[3].split(".")[0] +
            //         "</div>";
            //     htmlStr +=
            //         "<div class='music_length'>" +
            //         audio.name.split("_")[1] +
            //         "초" +
            //         "</div>";
            //     htmlStr +=
            //         "<div class='share' id='" +
            //         arrNumber[j] +
            //         "'><img src='img/web_share.png' alt='Share on Facebook'></div>";
            //     htmlStr +=
            //         "<div class='play' id='" +
            //         arrNumber[j] +
            //         "' ><img src='img/web_playsound.png' alt='play sound button'/></div>";
            //     j++;

            //     $(".play").click(function () {
            //         window.open(
            //             $(this).attr("id"),
            //             "둠칫둠칫",
            //             "height=100,width=180,toolbar=no"
            //         );
            //     });
            //     $(".share").click(function () {
            //         window.open(
            //             "http://www.facebook.com/share.php?u=" +
            //                 $(this).attr("id"),
            //             "둠칫둠칫",
            //             "height=250,width=300,toolbar=no"
            //         );
            //     });
            //     if (k % 4 == 0) {
            //         htmlStr += "</div>";
            //         htmlStr += "</li>";
            //     } else {
            //         htmlStr += "</div>";
            //     }
            //     ulDiv.append(htmlStr);
            // }

            // console.log(htmlStr);
            // li.appendChild(htmlStr);
            // ulDiv.appendChild(li);
        });
    }
}
