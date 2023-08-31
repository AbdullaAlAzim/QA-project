from lib2to3.pgen2.driver import Driver
from turtle import onclick
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait as wait
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys
import time
import re
import random

typing_speed = 0.5
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))

url = "http://ccv1dev101.dataflightit.com/app/auth_mmh/v2/signin"

browser = driver.maximize_window()
# customize browser screen
# driver.set_window_size(390, 844)
browser = driver.get(url)
time.sleep(5)
print(driver.title)
action = webdriver.ActionChains(driver)
email = driver.find_element(By.XPATH,'//*[@id="id_email"]')
email.click()
email_input = action.send_keys("jamilsadiq00@gmail.com").perform()
time.sleep(2)
password = driver.find_element(By.XPATH,'//*[@id="id_password"]')
password.click()
password_input = action.send_keys("72345@Jamil").perform()
time.sleep(2)
login = driver.find_element(By.XPATH,'/html/body/section/div/div/div[1]/div/div/div[2]/form/button')
login.click()
time.sleep(5)



