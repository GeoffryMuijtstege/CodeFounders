const buttons = new Array();

function Greet()
{
    let invoerVeld = document.getElementById("greetingField").value;
    invoerVeld = invoerVeld.toUpperCase();
    switch(invoerVeld)
    {
        case "HALLO":
            alert("Welkom");
            break;
        case "DOEI":
            alert("Tot de volgende keer");
            break;
        default:
            break;
    }
}

function checkForE()
{
    let invoerVeld = document.getElementById("checkfore").value;
    invoerVeld = invoerVeld.toUpperCase();
    if(invoerVeld.includes("E"))
    {
        alert("Er zit een e in!")
    }
}

function checkForLetter()
{
    let invoerVeld = document.getElementById("checkformultiple").value;
    let toCheck = document.getElementById("checkletter").value;
    invoerVeld = invoerVeld.toUpperCase();
    toCheck = toCheck.toUpperCase();
    let aantal = 0;
    for(let i = 0; i < invoerVeld.length; i++)
    {
        if(invoerVeld[i] == toCheck)
        {
            aantal++;
        }
    }
    if(aantal > 0)
    {
        if(aantal > 1)
        {
            alert(`Er zitten ${aantal} ${toCheck}'s in!`);
        }
        else
        {
            alert(`Er zit ${aantal} ${toCheck} in!`);
        }
    }
}

function whatButton(val)
{
    buttons.push(val);
    let div = document.createElement("div");
    div.id = 'buttonRecords';
    let br = document.createElement('br');

    if(buttons.length == 1)
    {
        document.getElementById('welkeKnop').appendChild(div);
    }
    else
    {
        div = document.getElementById('buttonRecords');
    }

    switch(val)
    {
        case "A":
            div.append("U heeft op knop A gedrukt");
            div.append(br);
            break;
        case "B":
            div.append("U heeft op knop B gedrukt \n");
            div.append(br);
            break;
        case "C":
            div.append("U heeft op knop C gedrukt \n");
            div.append(br);
            break;
        case "D":
            div.append("U heeft op knop D gedrukt \n");
            div.append(br);
            break;
    }
    console.log(div)
}