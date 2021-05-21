<?php
?>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <title>Doomchit-Doomchit[둠칫둠칫]</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <script src="js/index.js"></script>
</head>
<body>
  <div data-include-path="main.html"></div>
  <script>
    window.addEventListener('load', function() {
      var allElements = document.getElementsByTagName('*');
      Array.prototype.forEach.call(allElements, function(el) {
          var includePath = el.dataset.includePath;
          if (includePath) {
              var xhttp = new XMLHttpRequest();
              xhttp.onreadystatechange = function () {
                  if (this.readyState == 4 && this.status == 200) {
                      el.outerHTML = this.responseText;
                  }
              };
              xhttp.open('GET', includePath, true);
              xhttp.send();
          }
      });
  });
  </script>
</body>

</html>