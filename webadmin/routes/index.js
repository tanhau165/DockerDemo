var express = require('express');
var router = express.Router();

// docker run -d -p 3306:3306 --name mysql_account_host -e MYSQL_ROOT_PASSWORD=root123 -e MYSQL_DATABASE=mysql_account_db -e MYSQL_USER=mysql_root -e MYSQL_PASSWORD=Abcdabcd1 mysql:latest
var mysql = require('mysql'); // mysql_account_db, mysql_account_host,
var pool = mysql.createConnection({
  host: 'product_db',
  port: 3306,
  user: 'mysql_root',
  password: 'Abcdabcd1',
  database: 'mysql_product_db'
});


/* GET home page. */
router.get('/add', function(req, res, next) {
  var code = Math.random();
  var name = req.query.name;
  var price = parseInt(req.query.price);

  // res.render('hau', { cc: {code:code, name: name, price: price} });
  pool.connect(function (err){
    //nếu có nỗi thì in ra
    if (err) throw err.stack;
    pool.query('insert into product values (?,?,?)', [code, name, price], function (e, r, f) {
      if(e) return res.render('hau', { cc: 'fail'+ e });
      return  res.render('hau', { cc: 'ok' });
    });
  });
});

router.get('/',function (req,res,next) {
    res.render('index', { title: 'vxz' });
});

module.exports = router;
