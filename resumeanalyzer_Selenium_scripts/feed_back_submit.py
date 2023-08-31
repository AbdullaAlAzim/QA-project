from lib2to3.pgen2 import driver
from lib2to3.pgen2.driver import Driver
from turtle import onclick
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait as wait
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys
import time
import random
import string

driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))

url = "http://ccv1dev101.dataflightit.com/rw/help-center/guest-action/feedback/submit"

browser = driver.maximize_window()
browser = driver.get(url)
time.sleep(5)
print(driver.title)

first_name = ["Kai", "Hunter", "Luca", "Quinn", "River", "Skylar", "Hayden"]
last_name = ["James", "Doha", "Harden", "Jordan", "Bryant", "Williams", "Simmons"]
email = ["kai@gmail.com", "hunter@gmail.com", "luca@gmail.com", "quinn@gmail.com", "River@gmail.com", "Skylar@gmail.com", "Hayden@gmail.com"]
rand = random.randint(0, 6)
random_first_name = first_name[rand]
random_last_name = last_name[rand]
random_email = email[rand]
ran = ''.join(random.choices(string.ascii_letters + string.digits, k=100))
print(ran)
print(random_first_name)
print(random_last_name)
print(random_email)

name_first = driver.find_element(By.XPATH,"/html/body/section[2]/div/div/div[1]/div[2]/div/div/form/div[1]/div/div/div/input")
name_first.click()
name_first.send_keys(random_first_name)
time.sleep(2)

name_last = driver.find_element(By.XPATH,"/html/body/section[2]/div/div/div[1]/div[2]/div/div/form/div[2]/div/div/div/input")
name_last.click()
name_last.send_keys(random_last_name)
time.sleep(2)

email = driver.find_element(By.XPATH,"/html/body/section[2]/div/div/div[1]/div[2]/div/div/form/div[3]/div/div/div/input")
email.click()
email.send_keys(random_email)
time.sleep(2)
i = random.randint(1, 9)
product_like = driver.find_element(By.XPATH,f"/html/body/section[2]/div/div/div[1]/div[2]/div/div/form/div[4]/div/div/div/select/option[{i}]")
product_like.click()
time.sleep(2)

feedback = driver.find_element(By.XPATH,"/html/body/section[2]/div/div/div[1]/div[2]/div/div/form/div[5]/div/div/div/textarea")
feedback.click()
feedback.send_keys(ran)
time.sleep(5)

submit = driver.find_element(By.XPATH,"/html/body/section[2]/div/div/div[1]/div[2]/div/div/form/button")
submit.click()
time.sleep(10)  