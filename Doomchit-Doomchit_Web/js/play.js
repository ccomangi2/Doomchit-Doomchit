jQuery(document).ready(function ($) {
  "use strict";

  $(window).load(function () {
    youtube_play_api(); //window가 로드되면 함수 실행
  });

  function youtube_play_api() {
    var tag = document.createElement("script");
    tag.src = "https://www.youtube.com/iframe_api";
    var firstScriptTag = document.getElementsByTagName("script")[0];
    firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

    var player;

    // 수정 전
    // setTimeout(function(){
    //    player = new YT.Player('youtube_video', {});
    // }, 1000);

    // 영상이 준비되면 실행되는 함수
    window.onYouTubeIframeAPIReady = function () {
      player = new YT.Player("youtube_video", {});
    };

    $(".playbtn").click(function () {
      if (!player || typeof player.playVideo === "undefined") return;
      var fn = function () {
        player.playVideo();
      };
      setTimeout(fn, 1000);
    });

    // $("#pause").click(function () {
    //   player.pauseVideo();
    // });
  }
});
