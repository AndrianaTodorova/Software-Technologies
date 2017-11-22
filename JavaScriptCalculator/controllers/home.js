let Calculator = require("../models/Calculator");

module.exports = {
    indexGet: (req, res) => {
        res.render('home/index');
    },
    indexPost: (req, res) => {
      let calculateBody = req.body;
      let calculatorParams = calculateBody['calculator'];
      let calculator = new Calculator();
      calculator.leftOperand = Number(calculatorParams.leftOperand);
      calculator.operator = calculatorParams.operator;
      calculator.rightOperand = Number(calculatorParams.rightOperand);

      let result = calculator.calculateResult();
      res.render('home/index',{'calculator': calculator, 'result': result})
    }
};