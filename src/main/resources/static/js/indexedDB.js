/**
 * 这个试卷已经被考过了
 * 状态1
 * @type {IDBFactory | *}
 */
window.indexedDB = window.indexedDB || window.mozIndexedDB || window.webkitIndexedDB || window.msIndexedDB;
if (!window.indexedDB) {
    console.log("你的浏览器不支持IndexedDB");
}

let status = 1;
let db;
let request = window.indexedDB.open("paperDB", 1);
request.onsuccess = function (event) {
    console.log("成功打开DB");
    db = event.target.result;
    if (status === 0) {
        add();
    } else {
        readAll();
    }
};
request.onupgradeneeded = function (event) {
    console.log("Upgrading");
    db = event.target.result;
    if (db.objectStoreNames.contains('paper')) {
        console.log("有数据库")
    }
    if (!db.objectStoreNames.contains('paper')) {
        let objectStore = db.createObjectStore('paper', {keyPath: 'id'});
    }
};

function add() {
    if (!db) {
        return;
    }
    request = db.transaction(['paper'], 'readwrite');
    let objectStore = request.objectStore('paper');
    for (let i = 1; i <= 100; i++) {
        objectStore.add({id: i.toString(), value: null});
    }
}

function readAll() {
    let objectStore = db.transaction('paper').objectStore('paper');
    objectStore.openCursor().onsuccess = function (event) {
        let result = event.target.result;
        if (result) {
            let inputName = 'answer' + result.key;
            $("input[name='" + inputName + "'][type='radio']").each(function () {
                let str = $(this).val();
                if (str === result.value.value) {
                    $(this).attr("checked", true);
                }
            });
            $("input[name='" + inputName + "'][type='checkbox']").each(function () {
                let str = result.value.value.split(',');
                for (let i = 0; i < str.length; i++) {
                    if ($(this).val() === str[i]) {
                        $(this).attr("checked", true);
                    }
                }
            });
            result.continue();
        } else {

        }
    };
}

function update(index, value) {
    request = db.transaction(['paper'], 'readwrite')
        .objectStore('paper')
        .put({id: index, value: value});
}

function deleteDB() {
    indexedDB.deleteDatabase('paperDB');
}