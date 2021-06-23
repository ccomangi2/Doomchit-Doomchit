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
            res.items.forEach(function (ref) {
                i++;
                console.log("ref" + ref);
                displaylist(i, ref);
            });
        });
    var j = 0;
    function displaylist(row, audio) {
        audio.getDownloadURL().then(function (url) {
            // 곡 있는 개수의 /4 (반올림)  [ ex) 곡 5개면 2번 반복 ] 만큼 반복문
            // row = stroageRef에서 넘어온 i

            let ulDiv = document.getElementById("image-gallery");
            let htmlStr = "";

            if (row % 4 == 1) {
                htmlStr += "<li data-thumb>";
                htmlStr += "<div class='container'>";

                console.log(url);
            }

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
                "'><img src='img/web_playsound.png' alt='play sound button'></div>";

            htmlStr += "</div>";

            if (row % 4 == 0 || row == 5) {
                htmlStr += "</div>";
                htmlStr += "</li>";
            }

            $(ulDiv).append(htmlStr);

            $(".play").click(function () {
                window.open($(this).attr("id"));
                location.reload();
                location.reload();
            });
            $(".share").click(function () {
                window.open(
                    "http://www.facebook.com/share.php?u=" + $(this).attr("id")
                );
                location.reload();
                location.reload();
            });
        });
    }
}
