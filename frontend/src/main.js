import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import router from './router'
import PrimeVue from 'primevue/config';

import 'primevue/resources/themes/saga-blue/theme.css';
import 'primevue/resources/primevue.min.css';
import 'primeflex/primeflex.css';
// import 'primeicons/primeicons.css';

import Button from "primevue/button"
import MenuBar from "primevue/menubar"
import InputText from "primevue/inputtext"

const app = createApp(App)
app.use(PrimeVue, { ripple: true })
app.use(router)

app.component('Button', Button)
app.component('InputText', InputText)
app.component('MenuBar', MenuBar)



app.mount('#app')
