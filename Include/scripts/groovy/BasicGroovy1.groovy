// Basics

println "  Hello World...!"

def hello(){
	println "  Hello Groovy"
}

def hello(String user){
	println "  Hello ${user}"
}

hello()
hello("Raghav")

// Variables

def name = "Groovy"

println ' name is '+name
println ' name is ${name}'
println " name is ${name}"

def x = 10
def X = 10
println x
println X

def (String a,int b, Double c) = [30,40,50]
println a
println b
println c


// Conditional Statements

def num = 11
if(num == 10){
	println "Num is 10"
}else{
	println "Num is not 10"
}

x=-1
def result = ""
switch(x){
	case 0:
	result = "Num is 0"
	break;
	
	case 10:
	result = "Num is 10"
	break;
	
	case{x>10}:
	result = "x is greater than 10"
	break;
	
	default:
	result = "x is invalid"
	
	
}

println result


// Loops

for(i in 1..5){
	println i
}

println "======================="

1.upto(5)
{
	println "$it"
}


println "======================="

1.step(10,2)
{
	println "$it"
}

println "======================="

5.times{
	println "$it"
}


def map = ['name':'John', 'place':'Chicago','phoneNo':'123-456-7890']

for(e in map){
	println e
	println e.key
	println e.value
}

int i = 1

while(i < 5){
	println i
	i = i+1
}

// Exception Handling

try{
int k = 1/0

}catch(Exception exp){
	println "Inside catch block"
}
finally{
	println "Inside finally block "
}
println " This is some other code"

// Lists

def fruits = ["Apples", "Oranges", "Grapes"]

println fruits[1]
println fruits.get(2)






