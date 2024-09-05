function myFun() {
        alert("Hello bro");
        var marks=prompt("How many marks u got");
        if (marks>50) {
            alert("You pass");
        } else {
            alert("You fail");
        }
} 

function table(){
    
    for (let i = 1; i <=10; i++) {
        var a=i
        for (let index = 1; index <=10; index++) 
            {
                const element=a*index;
            document.write(element+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
            
        }
        document.write("<br>");
    }
}

function table1(){
    document.write("<table border=1>")
    for (let i = 1; i <=10; i++) {
        document.write("<tr>");
        for (let index = 1; index <=10; index++) 
            {
                document.write("<td>"+i*index+"</td>");
        }
        document.write("</tr>");
    }
    document.write("</table>");
}

function pattern() {
    let n = 10;
    for (let i = 1; i <= n; i++) 
    {
        let str = "*";
        document.write(str.repeat(i));
        document.write("<br>");
    }
}

function number_pyramid()
{
    for (let i = 1; i <= 10; i++) 
        {
    
            for (let j = 1; j <= 10- i; j++) 
                {
                document.write("&nbsp")
                
                }
                
            for (let k = 0; k < i ; k++) 
                {
                    document.write(i+"&nbsp")
                }
                document.write("<br>");
        }
}

function number_square(number)
{
    return (number*number);
}

//js objects
emp={
    id:102,
    name:"Shyam Kumar",
    salary:40000}  

var emp1=new Object();  
emp1.id=101;  
emp1.name="Ravi Malik";  
emp1.salary=50000;  

function book(title,price)
{
    this.title=title;
    this.price=price;
    this.changePrice=changePrice;

    function changePrice(newPrice)
    {
        this.price=newPrice;
    }
}

  