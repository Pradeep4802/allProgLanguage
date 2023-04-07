const audio = new Audio("music.mp3");
const play = document.querySelectorAll("#play");
const pause = document.querySelectorAll("#pause");

play.forEach((button) => {
  button.addEventListener("click", () => {
    audio.play();
    let time = audio.currentTime;
    // setTimeout(() => {
    //   audio.pause();
    // }, 20000);
    console.log("Music is ON!!");
    console.log(time);
  });
  //   button.addEventListener("dblclick", () => {
  //     audio.pause();
  //     console.log("Music is OFF!!");
  //   });
});
pause.forEach((button) => {
  button.addEventListener("click", () => {
    audio.pause();
    console.log("Music is OFF!!");
    pause.innerHTML = <i class="fa-solid fa-play"></i>;
  });
});

// Countdown
// audio.addEventListener("timeupdate", function() {
//     var timeleft = document.getElementById('timeleft');
//     var ml = parseInt((audio.duration / 60 - audio.currentTime / 60) % 60);

//     // Here's the incorrect seconds countdown calc
//     var sl = parseInt(audio.duration % 60 - audio.currentTime);

//     if (sl < 10) {
//       timeleft.innerHTML = ml + ':0' + sl;
//     }
//     else {
//       timeleft.innerHTML = '-' + ml + ':' + sl;
//     }
// }, false);



{/* <button data-playing="false" role="switch" aria-checked="false">
  <span>Play/Pause</span>
</button> */}