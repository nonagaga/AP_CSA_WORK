while(true){
    try {
        setTimeout (function loop(){
            document.getElementsByClassName("btn-control-sm btn-full-width rbx-running-games-load-more")[0].click();
        }, 500);

    }
    catch(error){
        break;
    }
}