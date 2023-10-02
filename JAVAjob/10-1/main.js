問1
let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
let num = numbers.filter(i => i % 2 === 0);
isEven()

function isEven() {
    console.log(num + 'は偶数です');
}


問2
class Car{
	constructor(gas, num){
		this.gas = gas;
		this.num = num;
	}

	getNumGas() {
		console.log(`ガソリンは${this.gas}です。ナンバーは${this.num}です`)
	}
}
let info = new Car('〇〇','△△');
info.getNumGas();






