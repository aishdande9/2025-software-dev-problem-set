
var MinStack = function() {
    this.stack = [];
};


/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function(val) {
    this.stack.push(val)
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    this.stack.pop();
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    return this.stack[this.stack.length - 1]; 
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
   let temp = [];
   let min = this.stack[this.stack.length-1];
while(this.stack.length>0){
    min = Math.min(min,this.stack[this.stack.length-1]);

    temp.push(this.stack.pop());

}

while(temp.length>0){
    this.stack.push(temp.pop())
}
return min;

};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */