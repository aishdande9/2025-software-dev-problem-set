/**
 * @param {number} target
 * @param {number[]} position
 * @param {number[]} speed
 * @return {number}
 */
var carFleet = function(target, position, speed) {

    let cars = [];
    for(let i=0;i<position.length;i++){
        cars.push([position[i],speed[i]]);
    }

    cars.sort((a,b)=>b[0]-a[0]);
let stack = [];
    for(let [pos,spd] of cars){
    const time = (target-pos)/spd;
//if stack is empty then only start a new fleet
    if(stack.length===0||time>stack[stack.length-1]){
    stack.push(time);//push new fleet
    }

    }
    return stack.length;
};