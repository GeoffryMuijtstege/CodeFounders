let getal1;
let getal2;

function Calculate(getal1, operator, getal2)
{
    switch(operator) {
        case '*':
          getal3 = getal1 * getal2;
          break;
        case '+':
            getal3 = getal1 + getal2;
          break;
        case '/':
            getal3 = getal1 / getal2;
            break;
        case '-':
            getal3 = getal1 - getal2;
            break;
        default:
            getal3 = "error!";
      }
      console.log(getal3);
}

function getValues()
{
    getal1 = parseFloat(document.getElementById('getal1-invoer').value);
    operator = document.getElementById('operator-invoer').value;
    getal2 = parseFloat(document.getElementById('getal2-invoer').value);
    Calculate(getal1, operator, getal2);
}