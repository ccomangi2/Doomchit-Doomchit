window.addEventListener("load", Ready);
function Ready(){
if(window.File && window.FileReader){
document.getElementById('UploadButton').addEventListener('click', StartUpload);
document.getElementById('FileBox').addEventListener('change', FileChosen);
}
else
{
document.getElementById('npm install socket.io --saveUploadArea').innerHTML = "지원되지 않는 브라우저입니다. 브라우저를 업데이트하거나 IE나 Chrome을 사용하세요.";
}
}