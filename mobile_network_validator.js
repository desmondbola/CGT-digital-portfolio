function show() {
    let inputNumber = document.getElementById("input1").value;
    checkNumber(inputNumber);
  }
  
  let listMtn = ["0810", "0813", "0814", "0816", "0703", "0803", "0903", "0906"];
  let listAirtel = ["0802", "0808", "0902", "0907", "0701", "0812", "0708"];
  let listGlo = ["0705", "0805", "0905", "0807", "0811", "0815"];
  let list9mobile = ["0809", "0908", "0909", "0817", "0818"];
  let digits = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "0"];
  
  function checkNumber(number) {
    let displayText = document.getElementById("t-2");
    let image = document.getElementById("img-1");
  
    if (String(number).startsWith("+234")) {
      number = "0" + number.slice(4);
    }
  
    for (let i = 0; i < number.length; i++) {
      if (!digits.includes(number.charAt(i))) {
        displayText.innerText = "number cannot contain characters";
        image.src = "";
        return;
      }
    }
  
    if (number.length !== 11) {
      displayText.innerText = "number of digits must be 11";
      image.src = "";
      return;
    }
  
    let num = number.slice(0, 4);
  
    if (listMtn.includes(num)) {
      displayText.innerText = "Mtn";
      image.src = "./mtn-logo.png";
    }
  
    if (listAirtel.includes(num)) {
      displayText.innerText = "Airtel";
      image.src = "./airtel-logo.png";
    }
  
    if (listGlo.includes(num)) {
      displayText.innerText = "Glo";
      image.src = "./glo-logo.png";
    }
  
    if (list9mobile.includes(num)) {
      displayText.innerText = "9mobile";
      image.src = "./9mobile-logo.png";
    }
  }