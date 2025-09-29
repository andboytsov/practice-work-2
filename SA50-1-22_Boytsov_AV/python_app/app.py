from flask import Flask
import os

app = Flask(__name__)

@app.route('/')
def hello():
    return f'<h1>Hello from Python Docker container!</h1><p>Hostname: {os.uname().nodename}</p>'

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)