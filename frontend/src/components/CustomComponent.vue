<template>
    <div class="p-fluid p-formgrid p-grid">
        <div class="p-field col">
            <div class="p-field">
                <label>Username</label>
                <InputText v-model="username"></InputText>
            </div>
            <div class="p-field">
                <label>Password</label>
                <InputText v-model="password"></InputText>
            </div>
        </div>
    </div>
    <div class="p-fluid p-formgrid p-grid">
        <div class="col">
            <Button :label="'Authenticate me'" @click="testConnection()"></Button>
            {{ result }}
        </div>
    </div>
</template>
<script setup>
import { ref } from 'vue'
import axios from 'axios'

const result = ref();

const username = ref();
const password = ref()

const items = ref([
    {
        label: 'File',
        icon: 'pi pi-fw pi-file',
        items: [
            {
                label: 'New',
                icon: 'pi pi-fw pi-plus',
                items: [
                    {
                        label: 'Bookmark',
                        icon: 'pi pi-fw pi-bookmark'
                    },
                    {
                        label: 'Video',
                        icon: 'pi pi-fw pi-video'
                    }
                ]
            },
        ]
    }
])

async function testConnection() {

    const response = await axios({
        method: 'get',
        url: '/api/auth?username=' + username.value + '&password=' + password.value,
    })
    result.value = response.data
}

</script>