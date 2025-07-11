/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
    let stack = [];
    let result = [];
    //push empty string open is 0 close is 0
stack.push({current:"",open:0,close:0})
while(stack.length>0){
    const{current,open,close}=stack.pop();
    if(current.length === n*2){
result.push(current)
continue;
    }
    if(open<n){
stack.push({current:current+"(",open:open+1,close:close});
    }if(close<open){
        stack.push({current:current+")",open:open,close:close+1});
    }
}

return result;
};