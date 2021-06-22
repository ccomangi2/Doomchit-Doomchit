function share(url) {
  window.open(
    "https://www.facebook.com/sharer/sharer.php?u=" + encodeURIComponent(url)
  );
  // window.open("http://www.facebook.com/sharer/sharer.php?u=" + url);
  // 도메인 연결 후 해당 링크로 바꾸기
}
