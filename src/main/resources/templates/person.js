class person{
    constructor(name,age) {
        this.name = name;
        this.age = age;
    }
}
function createPerson(name,age){
    return new person(name, age);
}
