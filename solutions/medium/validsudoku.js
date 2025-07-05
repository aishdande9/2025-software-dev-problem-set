/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {
    //step1

    for(let row = 0;row<9;row++){
        let res = new Set();

        for(let i=0;i<9;i++){
            if(board[row][i]==="."){
                continue;
            }
            if(res.has(board[row][i])){
                return false;
            }else{
                res.add(board[row][i])
            }
        }
    }

    //step2
    for(let col = 0;col <9;col++){
        let res = new Set ();
        for(let i=0;i<9;i++){
            if(board[i][col]==="."){
                continue;
            }
            if(res.has(board[i][col])){
                return false;
            }else{
                res.add(board[i][col]);
            }
        }
    }

    //step3

    for(let square = 0;square <9;square++){
        let res = new Set();

        for(let i=0;i<3;i++){
            for(let j=0;j<3;j++){
                let row = Math.floor(square/3)*3+i;
let col = (square%3)*3+j;

                if(board[row][col]==="."){
                    continue;
                }
if(res.has(board[row][col])){
 return false;
}else{
    res.add(board[row][col])
}
   

            }
        }
    }
    return true;
};