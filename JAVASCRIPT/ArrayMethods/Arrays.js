const hobbies = ['Sleeping','Reading','Coding','Roaming'];
console.log(typeof hobbies);

const isArrayOrNot =Array.isArray(hobbies);
console.log('Hobbies array or not',isArrayOrNot);

const hasSReading =hobbies.includes('Reading');
console.log('Using includes method',hasSReading)

hobbies.push('Guitar','Volleyball')
console.log('After Push method',hobbies)

hobbies.pop()
console.log('After Pop method',hobbies)

hobbies.unshift('Numismatics','Singing')
console.log('After Unshift method',hobbies);

hobbies.shift();
console.log('After Shift method',hobbies);


const hobbies1 = ['Sleeping','Cricket','Eating','Coding','Roaming'];
hobbies1.splice(1,2,'Bird Watching','PUBG')
console.log('After Splice method',hobbies1)

const afterSlice = hobbies1.slice(2,4)
console.log('After Slice method',hobbies1)
console.log('After slice method',afterSlice)

const afterIndexof = hobbies1.indexOf('Coding',2)
console.log('After indexof method',afterIndexof)

console.log(hobbies1.join)

const numbers = [100,200,300,400];
const nums1 = numbers.map(function(value,index){
    let newValue = value + 50
    return newValue
})

console.log('After Map method',nums1)
const nums2 = numbers.map(value => value + 500)
console.log('After Map arrow function',nums2)

console.log('=============')

const filternum =
        numbers.filter(function(value,index){
  if(value>200){
      return true
  }else{
      return false
  }
})
console.log('After filter method',filternum)

console.log("===========")

const filternumArrow =
  numbers.filter(value=>value>200)
  console.log('After filter method using arrow',filternumArrow)


