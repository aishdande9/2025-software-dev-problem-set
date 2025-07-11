/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function(tokens) {
    let stack = [];
    for(let i of tokens){
   
       if(i==="+"){
   stack.push(stack.pop()+stack.pop());
       }else if(i==="-"){
   const a = stack.pop();
   const b = stack.pop();
   stack.push(b-a);
   
       }else if(i==="*"){
           stack.push(stack.pop()*stack.pop());
       }else if(i==="/"){
           const a = stack.pop();
   const b = stack.pop();
   stack.push(Math.trunc(b/a));
       }else{
    stack.push(parseInt(i));
       }
      
    }
    return stack.pop();
   };