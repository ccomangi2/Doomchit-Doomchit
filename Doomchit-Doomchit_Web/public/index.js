// select BUTTOM
const btn = document.querySelector('button')
// ADD CLICK LISTENER TO THE BUTTON WE SELECTED
btn.addEventListener('click',e =>{

const final=firebase.storage().ref().child(`test`)
    
            //find all items..
            // Find all the prefixes and items.
            final.listAll().then(function(res) {
    
                res.items.forEach(function(itemRef) {
                    
                    // All the items under listRef.
                    //get the url   
                    itemRef.getDownloadURL().then(function(url) {
                        console.log(url);
                       
    
    
    
                    
                    }).catch(function(error) {
    
                        // A full list of error codes is available at
                        // https://firebase.google.com/docs/storage/web/handle-errors
                        switch (error.code) {
                        case 'storage/object-not-found':
                            // File doesn't exist
                            alert("File doesn't exist");
    
                            break;
    
                        case 'storage/unauthorized':
                            // User doesn't have permission to access the object
                            break;
    
                        case 'storage/canceled':
                            // User canceled the upload
                            break;
    
                        case 'storage/unknown':
                            // Unknown error occurred, inspect the server response
                            break;
                        }
                    });
    
                });
            }).catch(function(error) {
                // Uh-oh, an error occurred!
                console.log("Uh-oh, an error occurred!");
            })
        })